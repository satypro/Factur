    package com.factur.euclidean.space;
    
    import java.util.List;
	
    public class NPoint{
	
				private List<Long> point;
	            private int dimension;				
	            
				public NPoint(long...coordinates){
				   this.dimension = coordinates.length;
				   for (long l : coordinates) {
					    point.add(l);
				   }
				   
				}
				
				public int GetDimension(){
					
					return this.dimension;
				}
				
				public List<Long> GetNPoint(){
					return point;
				}
				
				public Long Coordinate(int dimensionname)
				{
					return point.get(dimensionname);
				}
				
				public long OriginSquaredDistance(){
					
					Long squaredDistance = 0l;
					for (Long x : point) {
					  squaredDistance+=(long)(Math.pow(x, 2));
					}
					return squaredDistance;
				}
				
				public long SquaredDistance(NPoint p)
				{
					Long squaredDistance = 0l;
					int iterator = 0;
				    	
					for (Long x : point) {
						squaredDistance += (long) (Math.pow(x - p.Coordinate(iterator),2));
						iterator++;
					}
					
					return squaredDistance;
				}
				
				public String toString(){
					StringBuffer buffer = new StringBuffer();
					buffer.append("[");
					for (Long x : point) {
						buffer.append(x).append(",");
					}
					buffer.replace(buffer.length()-1, buffer.length()-1,"]");
					return buffer.toString();
				}
				
    }
